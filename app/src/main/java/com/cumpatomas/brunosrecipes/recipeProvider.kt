package com.cumpatomas.brunosrecipes

class recipeProvider {

fun getRandomRecipe(): recipeModel {

    return list.shuffled().random()
}
fun getRecipesList(): String {
    val _list = mutableListOf<String>()
    for (i in list) {
        _list.add(i.name)
    }
    return _list.toString().replace("[", "").replace("]", "").replace(", ", "\n\n")
}
    val list = listOf<recipeModel>(

        recipeModel("Arroz con atún", "atún, tomate, huevo duro, arroz", "mayonesa"),
        recipeModel("Pollo al curry", "pollo, cebolla, leche de coco, manzana, curry, arroz", "zanahoria, pimiento, puerro" ),
        recipeModel("Milanesas con puré", "milanesas, patatas, leche, mantequilla", "boñato"),
        recipeModel("Tortitas de calabacín", "calabacín, requesón, huevo, avena ", "zanahoria, queso rallado"),
        recipeModel("Polenta con salsa", "polenta, salsa tomate, cebolla, brócoli", "zanahoria, pimiento, puerro" ),
        recipeModel("Arroz con atún", "atún, tomate, huevo duro, arroz", "mayonesa"),
        recipeModel("Pollo al curry", "pollo, cebolla, leche de coco, manzana, curry, arroz", "zanahoria, pimiento, puerro" ),
        recipeModel("Milanesas con puré", "milanesas, patatas, leche, mantequilla", "boñato"),
        recipeModel("Tortitas de calabacín", "calabacín, requesón, huevo, avena ", "zanahoria, queso rallado"),
        recipeModel("Arroz con atún", "atún, tomate, huevo duro, arroz", "mayonesa"),
        recipeModel("Pollo al curry", "pollo, cebolla, leche de coco, manzana, curry, arroz", "zanahoria, pimiento, puerro" ),
        recipeModel("Milanesas con puré", "milanesas, patatas, leche, mantequilla", "boñato"),
        recipeModel("Tortitas de calabacín", "calabacín, requesón, huevo, avena ", "zanahoria, queso rallado"),
        recipeModel("Polenta con salsa", "polenta, salsa tomate, cebolla, brócoli", "zanahoria, pimiento, puerro" ),
        recipeModel("Arroz con atún", "atún, tomate, huevo duro, arroz", "mayonesa"),
        recipeModel("Pollo al curry", "pollo, cebolla, leche de coco, manzana, curry, arroz", "zanahoria, pimiento, puerro" ),
        recipeModel("Milanesas con puré", "milanesas, patatas, leche, mantequilla", "boñato"),
        recipeModel("Tortitas de calabacín", "calabacín, requesón, huevo, avena ", "zanahoria, queso rallado"),
        recipeModel("Polenta con salsa", "polenta, salsa tomate, cebolla, brócoli", "zanahoria, pimiento, puerro" )

    )
}