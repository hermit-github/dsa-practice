const number = 789879;

const isPalindrome = (num) => {

    let reversedNum = 0;
    let actualNum = num;

    while (actualNum > 0) {
        reversedNum = reversedNum * 10 + actualNum % 10;
        actualNum = Math.floor(actualNum / 10);
    }

    actualNum = num;

    while(actualNum > 0) {
        if(actualNum %10 === reversedNum %10){
            actualNum = Math.floor(actualNum / 10);
            reversedNum = Math.floor(reversedNum / 10);
        } else {
            return false;
        }
    }

    return true;
}

console.log(isPalindrome(number));