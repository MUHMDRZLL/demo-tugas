package com.mycompany.librarysystem;

public interface LibraryOperationsUser {
    void addUse(User user);
    void viewUsers();
    void updateUser(int userId, String newName); // Sesuaikan kebutuhan
    void borrowBook(int bookId, int userId);
    void returnBook(int bookId);
}
