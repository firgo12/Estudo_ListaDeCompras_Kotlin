package firgo12.com.github.model

data class ItemModel(
    val name: String,
    val onRemove: (ItemModel) -> Unit
)