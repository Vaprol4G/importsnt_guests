fun print_mass(mass : Array<Array<Int>>, base_arr : Array<Array<Int>>, it1: Int)
{
    for (i in 0 until base_arr[it1][0])
    {
        for (j in 0 until base_arr[it1][1])
        {
            print(mass[i][j])
            print(" ")
        }
        println()
    }
    println()
}

fun G_iput() : Array<Array<Int>>
{
    var ggggggggggggg : Array<Array<Int>> = Array(0) { Array(0) { 0 } }

    while (true)
    {
        try
        {
            var box1 : String
            println("Введите кол-во тестов")
            val amo = readln()
            val tests: Array<Array<Int>> = Array(amo.toInt() + 1) { Array(2) { 0 } }
            tests[0][0] = amo.toInt()
            for (i in 1 .. amo.toInt())
            {
                println("Введите кол-во строк")
                box1 = readln()
                tests[i][0] = box1.toInt()
                println("Введите кол-во столбцов")
                box1 = readln()
                tests[i][1] = box1.toInt()

            }
            return tests
        } catch (e: Exception)
        {
            println("Неверный ввод")
            continue
        }
    }
    return ggggggggggggg
}

fun main()
{


    val base_ar = G_iput()
    for (it1 in 1 .. base_ar[0][0])
    {
        val mass: Array<Array<Int>> = Array(base_ar[it1][0]) { Array(base_ar[it1][1]) { 0 } }
        var num1 = base_ar[it1][0] * base_ar[it1][1]
        mass[0][0] = num1
        num1 --
        var cou1 = 0



        while (num1 != 0)
        {
            cou1 ++
            var ich = true
            var jch = true
            var ii = 0
            var jj = 0
            while (true)

            {
                if (cou1 < base_ar[it1][1] && ii != cou1 && ii < base_ar[it1][0])
                {
                    mass[ii][cou1] = num1
                    num1 --
                    ii ++
                }
                else
                {
                    ich = false
                }

                if (cou1 < base_ar[it1][0] && jj != cou1 && jj < base_ar[it1][1])
                {
                    mass[cou1][jj] = num1
                    num1 --
                    jj ++
                }
                else
                {
                    jch = false
                }
                if (!ich && !jch)
                {
                    try {
                        mass[ii][jj] = num1
                        num1--
                        break
                    }
                    catch (e: Exception)
                    {
                        break
                    }
                }

            }

        }


        print_mass(mass, base_ar, it1)
    }
}