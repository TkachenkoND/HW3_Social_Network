package com.example.hw_3.Model

import com.example.hw_3.R

class UserData {
    val userList: ArrayList<User> = ArrayList()

    init {
        //Неробоча лінка для перевірки плейсхолдера
        userList.add(User("Julia", "5 min ago", "https://camealabs.org/media/k2/items/cache/3cb06e4cb464be7a87ae9907c7d62b4b_L.jpg","Status: Kill me or love.",
            "Consequat diam sapien imperdiet fusce nunc dis ipsum bibendum porttitor donec at," +
                    " elementum ultrices dolor massa vitae urna convallis dignissim tempor montes, cubilia" +
                    " consectetur tincidunt purus vestibulum odio nostra nisl tellus tortor. Maecenas vel curae" +
                    " conubia senectus nam molestie aptent, ante cras aliquet lobortis magna quisque sagittis nibh," +
                    " dictumst eget interdum tincidunt scelerisque montes. Interdum dignissim penatibus odio" +
                    " consequat neque nulla libero litora ut donec cubilia, fusce tempor justo massa a sodales eu" +
                    " parturient pharetra sagittis. Tristique nam potenti libero netus torquent sociosqu urna tempus" +
                    " tellus, mattis mus tortor in lobortis parturient senectus ut pellentesque, scelerisque lacus" +
                    " posuere amet a dapibus luctus commodo."))

        //Вітсутня лінка для перевірки плейсхолдера
        userList.add(User("Jacob", "11 min ago", "","Status: For the love of the game.",
            "Fames lacus ultrices luctus commodo pulvinar cras litora curabitur non scelerisque aliquet," +
                    " nunc vel in orci pretium interdum porta lacinia fringilla felis consequat, accumsan aliquam" +
                    " vehicula adipiscing congue leo vitae dolor diam urna. Consequat eros vulputate tristique purus" +
                    " faucibus, sem lacus metus habitasse, pulvinar pharetra tincidunt nec. Natoque convallis" +
                    " fringilla pretium lorem dis ad ante himenaeos, vestibulum purus elementum habitasse" +
                    " pellentesque interdum. Sollicitudin malesuada consequat platea aliquam varius amet mattis" +
                    " fringilla arcu tellus, molestie nullam per nostra bibendum fusce sagittis sociosqu auctor," +
                    " egestas fames facilisis adipiscing mi condimentum parturient dictumst lectus. Lectus auctor" +
                    " urna feugiat egestas rhoncus turpis montes leo, vestibulum potenti ultrices volutpat platea" +
                    " congue sapien maecenas, et sodales diam libero sollicitudin dapibus mollis. Volutpat per proin" +
                    " primis inceptos pulvinar urna egestas erat elit consectetur eu a, sit arcu praesent cras viverra" +
                    " commodo ultrices penatibus porta ornare massa. Placerat netus integer porta magna" +
                    " consectetur cursus non neque dui, eu dignissim per libero turpis varius ex rhoncus."))

        userList.add(User("Agata", "3 hours ago","https://vokrug.tv/pic/news/2/f/4/9/2f49ebf2e3ba8f8ca3caacf8ae365eaf.jpg","Status: Make love not war",
            "Lorem ipsum dolor sit amet consectetur adipiscing elit tempor felis at, natoque a lacus" +
                    " venenatis vivamus facilisis finibus quisque sagittis justo pharetra, aenean porttitor ridiculus" +
                    " neque libero feugiat eleifend scelerisque dictumst. Accumsan amet quisque morbi ante hac at duis," +
                    " curae cursus scelerisque sem quam tincidunt dui libero, class finibus convallis interdum bibendum nunc." +
                    " Porta ridiculus lacinia tempus vestibulum mus etiam aliquam, fusce odio elementum enim consequat nunc," +
                    " amet metus posuere nam vehicula cras. Senectus nascetur vulputate porttitor iaculis ac placerat nibh" +
                    " accumsan cras, vel malesuada dictum dictumst habitasse proin aenean faucibus, suscipit ullamcorper lacus" +
                    " laoreet potenti pulvinar litora ut. Finibus magna cursus senectus varius habitasse conubia pellentesque" +
                    " risus justo morbi laoreet sagittis cras commodo, posuere rutrum suspendisse orci vestibulum duis convallis" +
                    " natoque adipiscing torquent ultrices semper libero."))

        userList.add(User("Ida", "Yesterday", "https://www.mckinsey.com/~/media/mckinsey/our%20people/ida%20kristensen/ida-kristensen_profile_1536x1152.jpg","Status: Follow your heart",
            "Hac inceptos gravida ultricies a habitasse donec consectetur, natoque hendrerit ridiculus" +
                    " suspendisse nec sollicitudin ad, tortor non iaculis vel et nisi. Imperdiet leo lorem nam dui" +
                    " adipiscing aptent justo vehicula montes vestibulum, enim a ex morbi nostra diam duis suscipit" +
                    " habitasse. Habitasse integer ligula sit porttitor rutrum fringilla pellentesque phasellus platea," +
                    " hendrerit mi habitant nostra curae natoque nisi scelerisque facilisis, faucibus laoreet commodo" +
                    " mattis etiam dolor in maximus. Litora inceptos himenaeos conubia aptent massa pretium, adipiscing" +
                    " quis vestibulum curae etiam sed posuere, elementum pulvinar egestas ultrices curabitur. Gravida" +
                    " imperdiet nostra finibus platea semper senectus mi sem, ridiculus nisi ipsum congue etiam integer" +
                    " mattis, nec vitae nulla lorem netus arcu donec."))

        userList.add(User("William", "45 min ago", "https://upload.wikimedia.org/wikipedia/commons/a/af/William_Sumbarines_Crop.png","Status: Remember who you are",
            "Tincidunt consequat class sapien faucibus ipsum vehicula habitasse, non et risus euismod" +
                    " rutrum facilisis massa, nulla conubia quam maecenas cras sem. Mi feugiat malesuada velit hac" +
                    " sollicitudin lectus dui ante metus leo massa quisque, phasellus tincidunt faucibus id parturient" +
                    " augue nibh aliquet porttitor hendrerit volutpat. Parturient litora feugiat curae primis vulputate" +
                    " pharetra tempus, velit curabitur conubia nascetur dignissim eu, duis risus lobortis erat suscipit" +
                    " vivamus. Pellentesque interdum elementum augue habitasse justo cubilia est dolor egestas, maximus" +
                    " luctus venenatis cras volutpat habitant tellus mollis. Quam habitant justo felis parturient" +
                    " habitasse maximus iaculis venenatis, platea quisque feugiat auctor facilisi phasellus neque " +
                    "tincidunt hac, porttitor in ridiculus tortor sem proin aliquam."))

        userList.add(User("Harry", "Yesterday", "https://media.vanityfair.com/photos/5ffdce32d5b8a24007b9e97f/master/w_2560%2Cc_limit/996288038","Status: Live without regrets",
            "Lorem ipsum dolor sit amet consectetur adipiscing, elit suspendisse etiam phasellus et integer," +
                    " cras ex erat senectus hendrerit. Donec ad aptent fermentum non mi dolor conubia penatibus," +
                    " efficitur hac egestas posuere ullamcorper metus turpis feugiat odio, congue nulla blandit" +
                    " laoreet dis sodales leo. Sagittis neque consectetur sed etiam porttitor maximus sem elementum," +
                    " pulvinar a vehicula curabitur suspendisse ex nostra, vestibulum finibus facilisi quisque elit" +
                    " hac magnis. Nisi mauris amet pulvinar ante lacinia volutpat commodo magna, vivamus eget tortor" +
                    " varius rutrum lacus interdum sapien parturient, dignissim ex dolor semper in velit malesuada." +
                    " Tristique penatibus aliquet fermentum nibh vitae taciti aenean hendrerit rhoncus, eleifend fames" +
                    " integer in pellentesque nostra ad tincidunt."))

        userList.add(User("Angelina", "2 hours ago", "https://i.pinimg.com/736x/b3/c9/be/b3c9beccb656b7d415b90b077d14ca23.jpg","Status: No pain no gain",
            "Aenean et dui massa fusce ex dolor, eleifend urna morbi vulputate ac, aliquet aliquam" +
                    " fermentum etiam habitant. Condimentum sociosqu turpis facilisis faucibus porttitor natoque" +
                    " orci eleifend euismod, ligula eu molestie hendrerit bibendum volutpat nisl montes fermentum," +
                    " quam phasellus adipiscing aptent maecenas sem mattis fusce. Nibh euismod curabitur orci" +
                    " bibendum id donec potenti consectetur et cras, aptent urna molestie velit montes diam efficitur" +
                    " per semper, sagittis tincidunt scelerisque aliquet malesuada odio at suscipit penatibus." +
                    " Penatibus elit morbi amet accumsan orci aenean rhoncus, nec ipsum quis quam tempor rutrum facilisi," +
                    " pellentesque pulvinar curabitur sociosqu purus erat. Bibendum facilisi metus elementum euismod" +
                    " imperdiet tempus purus natoque consectetur, sapien sed diam hendrerit quis suspendisse justo suscipit," +
                    " dui maximus cras sem rutrum urna mollis conubia. Enim at ultrices rutrum class id eleifend, a purus" +
                    " fusce euismod consectetur habitasse pulvinar, auctor mi platea vulputate sociosqu. Tempus quam" +
                    " dignissim quisque penatibus netus pharetra sociosqu commodo, dui etiam ullamcorper senectus vestibulum" +
                    " feugiat conubia consequat, condimentum fusce augue massa justo dictum nunc."))

    }
}