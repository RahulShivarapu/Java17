package com.example.demo.Java17Feature;

sealed class SealedClassesPractice permits A,B{

}
    
final class A extends SealedClassesPractice{

}
non-sealed class B extends SealedClassesPractice{

}
class D{

}
