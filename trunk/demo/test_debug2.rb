puts "Hello"

count = 10
while count < 100
    count +=42
    puts count
end

def test_method(var)

    puts "begin"

    for i in 0..var
        a = i*i
    end

    puts "middle"

    for i in 0..var
        a = i*i
    end

    puts "end"
end

for i in 0 .. 3
    test_method(i)
end

