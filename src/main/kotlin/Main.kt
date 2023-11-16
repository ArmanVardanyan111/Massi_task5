fun main(args: Array<String>) {
    var arr = arrayOf(readln(), readln(), readln(), readln(), readln(), readln())

    for (i in 0 until arr.size) {
        if (arr[i] != "0")
        {
            print(arr[i])
            print(' ')
            for (j in i+1 until  arr.size) {
                if (arr[j] != "0") {
                    for (r in 0 until arr[i].length) {
                        var boo = false
                        for (t in 0 until arr[j].length) {
                            if (arr[i][r] == arr[j][t]) {
                                boo = true
                            }
                        }
                        if (boo == true) {
                            if (r == arr[i].length - 1) {
                                print(arr[j])
                                arr[j] = "0"
                                print(" ")
                            }
                        } else {
                            break
                        }
                    }
                }
            }
            println()
        }
    }
}