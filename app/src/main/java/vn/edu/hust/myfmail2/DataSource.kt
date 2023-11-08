package vn.edu.hust.myfmail2

class DataSource {
    fun loadData() : ArrayList<ItemModel> {
        return arrayListOf(
            ItemModel("Thanh", "i am ironman", "10:00 AM"),
            ItemModel("Nguyen", "i am not ironman", "10:01 AM"),
            ItemModel("Tien", "am i ironman", "10:02 PM"),
            ItemModel("Nguyen Tien Thanh", "are you ironman?", "10:03 AM"),
            ItemModel("Human", "nothing to talk", "6:00 PM"),
            ItemModel("Dog", "goof goff", "6:01 PM"),
            ItemModel("Cat", "meow meow", "6:02 PM"),
            ItemModel("Duck", "cap cap", "6:03 PM"),
            ItemModel("Alien", "??????", "12:00 PM"),
            ItemModel("Thanh Nguyen", "hello", "1:00 AM"),
            ItemModel("Spider-Man", "thwip thwip", "12:00 AM"),
            ItemModel("Hulk", "smash smash", "11:00 PM"),
            ItemModel("Thor", "hammer time", "10:00 PM"),
            ItemModel("Captain America", "avengers assemble", "9:00 PM"),
            ItemModel("Iron Man", "I am Iron Man", "8:00 PM"),
            ItemModel("Superman", "Faster than a speeding bullet", "12:00 AM"),
            ItemModel("Wonder Woman", "Truth, justice, and the American way", "11:00 PM"),
            ItemModel("Batman", "I am the night", "10:00 PM"),
            ItemModel("Aquaman", "Talk to the fish", "9:00 PM"),
            ItemModel("Cyborg", "Booyah!", "8:00 PM"),
            ItemModel("Flash", "I'm the fastest man alive!", "7:00 PM"),
            ItemModel("Green Lantern", "In brightest day, in blackest night", "6:00 PM"),
            ItemModel("Martian Manhunter", "I can shapeshift", "5:00 PM"),
            ItemModel("Shazam", "Say my name!", "4:00 PM"),
            ItemModel("Starfire", "Starfire, princess of Tamaran", "3:00 PM"),
            ItemModel("Raven", "Azarath Metrion Zinthos", "2:00 PM")

        )
    }
}