# myProject
Search for matching values
Написать функцию с двумя параметрами-строками. Функция возвращает булево значение true если вторая строка содержится в первой строке как подстрока, и false в противном случае.
Например,
f("12345", "234") = true
f("12345", "235") = false
Write a function with two string parameters. The function returns the boolean value true if the second string is contained in the first string as a substring, and false otherwise.
For example,
f("12345", "234") = true
f("12345", "235") = false
Если b досчиталась до длины подстроки, значит совпадение найдено, завершаем функцию,
а если очередные символы не равны, то просто сбрасываем b в ноль, и всё.
If b has counted to the length of the substring, then a match is found, we complete the function,
and if the next characters are not equal, then just reset b to zero, and that's it.
Возвращаем истина при b равной длине строки, ложь если b не равен ей.
Return true if b is equal to the length of the string, false if b is not equal to it.
