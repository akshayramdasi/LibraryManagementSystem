### Core Entities and Their Attributes

* **Book**: The central entity in the system.
    * **Attributes**: `bookId`, `title`, `author`, `publisher`, `publicationYear`, `isbn`.
* **Author**: Represents the creator of a book.
    * **Attributes**: `authorId`, `name`, `biography`.
* **Member**: A person who can borrow books.
    * **Attributes**: `memberId`, `name`, `contactInfo`, `membershipStatus`.
* **Library**: The collection of books and members.
    * **Attributes**: `libraryId`, `name`, `address`.
    * **Methods**: `addBook()`, `removeBook()`, `addMember()`, `removeMember()`.

***

### Inheritance: `DigitalBook`

The `DigitalBook` class extends the `Book` class, inheriting all its attributes and methods. It adds attributes and methods specific to digital formats.

* **`DigitalBook` (extends `Book`)**
    * **Additional Attributes**: `fileFormat` (e.g., PDF, EPUB), `fileSize`.
    * **Additional Methods**: `download()`.

***

### Interfaces: `Borrowable` and `Searchable`

Interfaces define a contract for classes. Any class that implements an interface must provide a specific implementation for the methods defined in that interface.

* **`Borrowable` Interface**: This interface ensures that any class implementing it can be borrowed and returned.
    * **Methods**: `borrowItem(member)`, `returnItem(member)`.
* **`Searchable` Interface**: This interface allows items to be searched for.
    * **Methods**: `searchByTitle(query)`, `searchByAuthor(query)`.

### Relationships and Use Cases

* A **Book** has one or more **Authors**.
* A **Member** can borrow multiple **Books**.
* The **Library** manages all **Books** and **Members**.
* A user (a **Member**) can **search** for a book by its title or author using the `Searchable` interface.
* Once found, the user can **borrow** the book using the `Borrowable` interface.
* The system can handle both physical and digital books, with **DigitalBook** objects having additional functionalities like downloading.