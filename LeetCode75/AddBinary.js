function addBinary(str1, str2){

    const firstNumberList = str1.split("").map(e => Number(e));
    const secondNumberList = str2.split("").map(e => Number(e));
    const result = []

    let maxIterations = Math.max(firstNumberList.length,secondNumberList.length);

    let carry = 0;

    while(maxIterations--){
        const firstNumber = firstNumberList.pop() ?? 0;
        const secondNumber = secondNumberList.pop() ?? 0;

        let sum = firstNumber + secondNumber + carry;
        carry = 0;

        if(sum == 2){
            result.push(0);
            carry = 1;
        } else if (sum == 3){
            result.push(1);
            carry = 1;
        } else {
            result.push(sum);
        }
    }

    if(carry==1) result.push(carry);

    return result.reverse().join("");
}

console.log(addBinary("10101","111"));
