package pangram.main


class Pangram {

    companion object {

        fun isPangram(s:String): Boolean {
            var mark: BooleanArray
            println("Input: $s")
            println("The length of the sentence is ${s.length}")
            for (x in 0..s.length){
                println(s.get(x))
                if ('a'<=s.get(x) && 'z' >= s.get(x)){
//                    println(mark.get(x))
                }
            }
            return false
        }
    }


}