package com.example.study.algorithm

fun binarySearch(nums: List<Int>, value: Int): Int {
    var leftIndex = 0
    var rightIndex = nums.size - 1
    if (value > nums[rightIndex]) {
        return -1
    }
    while (leftIndex < rightIndex) {
        val centerIndex = (leftIndex + rightIndex) / 2
        if (nums[leftIndex] == value) {
            return leftIndex
        } else if (nums[rightIndex] == value) {
            return rightIndex
        } else if (nums[centerIndex] == value) {
            return centerIndex
        }

        if (nums[centerIndex] < value) {
            leftIndex = centerIndex + 1
        } else {
            rightIndex = centerIndex - 1
        }
    }
    return -1
}


fun main() {
    val num = listOf(0, 1, 5, 7, 9, 11, 15, 20, 24)
    val value = 1
    val result = binarySearch(num, value)
    if (result == -1) {
        println("NotFound")
    } else {
        println(result)
    }
}
