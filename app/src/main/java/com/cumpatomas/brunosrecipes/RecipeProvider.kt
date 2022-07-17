package com.cumpatomas.brunosrecipes

class RecipeProvider {

fun getRandomRecipe(): RecipeModel {

    return list.shuffled().random()
}


    companion object {
        val list = listOf<RecipeModel>(

            RecipeModel(
                "Arroz con atún",
                "atún, tomate, huevo duro, arroz",
                "mayonesa",
                "https://elcomercio.pe/resizer/Zsc8Tj5dQf2kb-LreZ7WUzwxPFU=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/WXYOHEPFURAL7JD24HYEP5UL7A.jpg"
            ),
            RecipeModel(
                "Pollo al curry",
                "pollo, cebolla, leche de coco, manzana, curry, arroz",
                "zanahoria, pimiento, puerro",
                "https://i.blogs.es/9ea7a4/pollo_curry-copia/1366_2000.jpg"
            ),
            RecipeModel("Milanesas con puré", "milanesas, patatas, leche, mantequilla", "boñato", "https://d320djwtwnl5uo.cloudfront.net/recetas/cover/milan_SuLEW9PUrTwyi0npoGIKD5zNqHmcAb.png"),
            RecipeModel(
                "Tortitas de calabacín",
                "calabacín, requesón, huevo, avena ",
                "zanahoria, queso rallado",
                "https://d36fw6y2wq3bat.cloudfront.net/recipes/tortitas-de-calabacin-y-queso/900/tortitas-de-calabacin-y-queso_version_1652879955.jpg"

            ),
            RecipeModel(
                "Polenta con salsa",
                "polenta, salsa tomate, cebolla, brócoli",
                "zanahoria, pimiento, puerro",
                "https://i.pinimg.com/564x/2b/2a/74/2b2a7417685a3bf5f207c2cd2f6a04d8.jpg"
            ),

            RecipeModel(
                "Pollo al curry",
                "pollo, cebolla, leche de coco, manzana, curry, arroz",
                "zanahoria, pimiento, puerro",
                "https://i.blogs.es/9ea7a4/pollo_curry-copia/1366_2000.jpg"
            ),
            RecipeModel("Milanesas con puré", "milanesas, patatas, leche, mantequilla", "boñato", "https://d320djwtwnl5uo.cloudfront.net/recetas/cover/milan_SuLEW9PUrTwyi0npoGIKD5zNqHmcAb.png"),
            RecipeModel(
                "Tortitas de calabacín",
                "calabacín, requesón, huevo, avena ",
                "zanahoria, queso rallado",
                "https://d36fw6y2wq3bat.cloudfront.net/recipes/tortitas-de-calabacin-y-queso/900/tortitas-de-calabacin-y-queso_version_1652879955.jpg"
            ),
            RecipeModel("Arroz con atún", "atún, tomate, huevo duro, arroz", "mayonesa", "https://elcomercio.pe/resizer/Zsc8Tj5dQf2kb-LreZ7WUzwxPFU=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/WXYOHEPFURAL7JD24HYEP5UL7A.jpg"),
            RecipeModel(
                "Pollo al curry",
                "pollo, cebolla, leche de coco, manzana, curry, arroz",
                "zanahoria, pimiento, puerro",
                "https://i.blogs.es/9ea7a4/pollo_curry-copia/1366_2000.jpg"
            ),
            RecipeModel("Milanesas con puré", "milanesas, patatas, leche, mantequilla", "boñato", "https://d320djwtwnl5uo.cloudfront.net/recetas/cover/milan_SuLEW9PUrTwyi0npoGIKD5zNqHmcAb.png"),
            RecipeModel(
                "Tortitas de calabacín",
                "calabacín, requesón, huevo, avena ",
                "zanahoria, queso rallado",
                "https://d36fw6y2wq3bat.cloudfront.net/recipes/tortitas-de-calabacin-y-queso/900/tortitas-de-calabacin-y-queso_version_1652879955.jpg"
            ),
            RecipeModel(
                "Arroz con atún",
                "atún, tomate, huevo duro, arroz",
                "mayonesa",
                "https://elcomercio.pe/resizer/Zsc8Tj5dQf2kb-LreZ7WUzwxPFU=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/WXYOHEPFURAL7JD24HYEP5UL7A.jpg"
            ),
            RecipeModel(
                "Pollo al curry",
                "pollo, cebolla, leche de coco, manzana, curry, arroz",
                "zanahoria, pimiento, puerro",
                "https://i.blogs.es/9ea7a4/pollo_curry-copia/1366_2000.jpg"
            ),
            RecipeModel("Milanesas con puré", "milanesas, patatas, leche, mantequilla", "boñato", "https://d320djwtwnl5uo.cloudfront.net/recetas/cover/milan_SuLEW9PUrTwyi0npoGIKD5zNqHmcAb.png"),
            RecipeModel(
                "Tortitas de calabacín",
                "calabacín, requesón, huevo, avena ",
                "zanahoria, queso rallado",
                "https://d36fw6y2wq3bat.cloudfront.net/recipes/tortitas-de-calabacin-y-queso/900/tortitas-de-calabacin-y-queso_version_1652879955.jpg"
            ),
            RecipeModel(
                "Arroz con atún",
                "atún, tomate, huevo duro, arroz",
                "mayonesa",
                "https://elcomercio.pe/resizer/Zsc8Tj5dQf2kb-LreZ7WUzwxPFU=/580x330/smart/filters:format(jpeg):quality(75)/cloudfront-us-east-1.images.arcpublishing.com/elcomercio/WXYOHEPFURAL7JD24HYEP5UL7A.jpg"
            )

        )
    }
}