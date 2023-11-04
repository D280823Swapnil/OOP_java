
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CandidateManagementSystem {

    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/yourdb";
        String username = "yourUsername";
        String password = "yourPassword";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Insert new candidate");
                System.out.println("2. Display all candidates");
                System.out.println("3. Increment votes of candidate with given id");
                System.out.println("4. Delete candidate with given id");
                System.out.println("5. Find candidate of given id");
                System.out.println("6. Find candidates of given party");
                System.out.println("7. Display total votes for each party");
                System.out.println("8. Exit");

                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        insertCandidate(connection, scanner);
                        break;
                    case 2:
                        displayAllCandidates(connection);
                        break;
                    case 3:
                        incrementVotes(connection, scanner);
                        break;
                    case 4:
                        deleteCandidate(connection, scanner);
                        break;
                    case 5:
                        findCandidateById(connection, scanner);
                        break;
                    case 6:
                        findCandidatesByParty(connection, scanner);
                        break;
                    case 7:
                        displayTotalVotesByParty(connection);
                        break;
                    case 8:
                        System.out.println("Exiting the program.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertCandidate(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter candidate name: ");
        String name = scanner.next();
        System.out.print("Enter party name: ");
        String party = scanner.next();
        System.out.print("Enter number of votes: ");
        int votes = scanner.nextInt();

        String sql = "INSERT INTO candidates (name, party, votes) VALUES (?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, party);
            preparedStatement.setInt(3, votes);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Candidate inserted successfully.");
            } else {
                System.out.println("Candidate insertion failed.");
            }
        }
    }

    private static void displayAllCandidates(Connection connection) throws SQLException {
        String sql = "SELECT * FROM candidates";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            System.out.println("Candidate List:");
            System.out.println("ID | Name | Party | Votes");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String party = resultSet.getString("party");
                int votes = resultSet.getInt("votes");
                System.out.println(id + " | " + name + " | " + party + " | " + votes);
            }
        }
    }

    private static void incrementVotes(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter candidate ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter the increment value: ");
        int increment = scanner.nextInt();

        String sql = "UPDATE candidates SET votes = votes + ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, increment);
            preparedStatement.setInt(2, id);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Votes incremented successfully.");
            } else {
                System.out.println("Incrementing votes failed. Candidate not found.");
            }
        }
    }

    private static void deleteCandidate(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter candidate ID to delete: ");
        int id = scanner.nextInt();

        String sql = "DELETE FROM candidates WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Candidate deleted successfully.");
            } else {
                System.out.println("Deletion failed. Candidate not found.");
            }
        }
    }

    private static void findCandidateById(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter candidate ID to find: ");
        int id = scanner.nextInt();

        String sql = "SELECT * FROM candidates WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int candidateId = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String party = resultSet.getString("party");
                    int votes = resultSet.getInt("votes");
                    System.out.println("Candidate found:");
                    System.out.println("ID | Name | Party | Votes");
                    System.out.println(candidateId + " | " + name + " | " + party + " | " + votes);
                } else {
                    System.out.println("Candidate not found.");
                }
            }
        }
    }

    private static void findCandidatesByParty(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter party name to search: ");
        String party = scanner.next();

        String sql = "SELECT * FROM candidates WHERE party = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, party);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                System.out.println("Candidates from party '" + party + "':");
                System.out.println("ID | Name | Party | Votes");
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String partyName = resultSet.getString("party");
                    int votes = resultSet.getInt("votes");
                    System.out.println(id + " | " + name + " | " + partyName + " | " + votes);
                }
            }
        }
    }

    private static void displayTotalVotesByParty(Connection connection) throws SQLException {
        String sql = "SELECT party, SUM(votes) as total_votes FROM candidates GROUP BY party";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            System.out.println("Total votes for each party:");
            System.out.println("Party | Total Votes");
            while (resultSet.next()) {
                String party = resultSet.getString("party");
                int totalVotes = resultSet.getInt("total_votes");
                System.out.println(party + " | " + totalVotes);
            }
        }
    }
}
