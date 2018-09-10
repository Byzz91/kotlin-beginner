var sum = 0

ints.filter { it > 0 }.forEach {
    // 'it'
    sum += it
}

println(sum)