def reverse[A](l: List[A]): List[A] = foldLeft(l, List[A](), (acc,h) => Cons(h,acc))
