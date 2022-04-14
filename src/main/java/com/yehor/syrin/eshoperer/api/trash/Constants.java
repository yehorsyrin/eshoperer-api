package com.yehor.syrin.eshoperer.api.trash;

public class Constants {
    public static final String US_GAMES_POST_BODY = """
            {
                "requests": [
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22esrbRating%3AEveryone%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22esrbRating%3AEveryone%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22esrbRating%3AEveryone%2010%2B%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22esrbRating%3AEveryone%2010%2B%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22esrbRating%3ATeen%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22esrbRating%3ATeen%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22esrbRating%3AMature%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22esrbRating%3AMature%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22availability%3APre-order%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22availability%3APre-order%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22availability%3AComing%20soon%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22availability%3AComing%20soon%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22availability%3AAvailable%20now%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22availability%3AAvailable%20now%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22franchises%3AMario%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22franchises%3AMario%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22franchises%3AZelda%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22franchises%3AZelda%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22franchises%3APok%C3%A9mon%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22franchises%3APok%C3%A9mon%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_asc",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22franchises%3AKirby%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    },
                    {
                        "indexName": "ncom_game_en_us_title_des",
                        "params": "hitsPerPage=1000&page=0&analytics=false&facets=%5B%22generalFilters%22%2C%22platform%22%2C%22availability%22%2C%22genres%22%2C%22howToShop%22%2C%22virtualConsole%22%2C%22franchises%22%2C%22priceRange%22%2C%22esrbRating%22%2C%22playerFilters%22%5D&facetFilters=%5B%5B%22franchises%3AKirby%22%5D%2C%5B%22platform%3ANintendo%20Switch%22%5D%5D"
                    }
                ]
            }""";

}