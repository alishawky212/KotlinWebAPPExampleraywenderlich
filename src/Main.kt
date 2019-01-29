
fun main(args: Array<String>) {
    val bookStorePresenter = BookStorePresenter()
    val bookStorePage = BookStorePage(bookStorePresenter)
    bookStorePresenter.attach(bookStorePage)
    bookStorePresenter.loadBooks()
    bookStorePage.show()
}

val API_URL = js("getApiUrl()") as String

