package edu.itesm.nytimes

data class Results(
    var results: Books,
)

data class Books(
    var books: MutableList<Book>
)


data class Book(
    val title: String,
    val description: String,
    val book_image: String
    )

