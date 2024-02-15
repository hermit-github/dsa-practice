const n = 5;

const factorialIterative = (n) => {
    let fact = 1;

    if(n === 0) return fact;

    for (let index = 1; index <= n; index++) {
        fact = fact * index;
    }
    return fact
}

const factorialRecursive = (n) => {
    if(n === 0 || n=== 1) return 1;
    return n*factorialRecursive(n-1)
}

console.log(factorialRecursive(n))