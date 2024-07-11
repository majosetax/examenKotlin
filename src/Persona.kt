class Persona(val name:String, val age:Int, val hobby:String?, val referrer:Persona?) {

    fun showProfile() {
        println("Name: " + name)
        println("Age: "+age)

        if(hobby != null){
            print("Likes to "+hobby)
        }
        if (referrer != null) {
            print(" Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                println(" who likes ${referrer.hobby}")
            }
        } else {
            print(" Doesn't have a referrer.")
        }
        print("\n")

    }
}