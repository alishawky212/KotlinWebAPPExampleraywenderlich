interface BookStoreContract {
    interface View {
        fun showBooks(books: List<Book>) // 1
        fun showLoader() // 2
        fun hideLoader() // 3
    }

    interface Presenter {
        fun attach(view: View) // 4
        fun loadBooks() // 5
    }
}