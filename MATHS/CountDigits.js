const x = 87965;

const countDigits = (x_) => {
    let count = 0;
    let x = x_;
    while (x > 0) {
        x = Math.floor(x / 10);
        count++;
    }
    return count;
}

console.log(countDigits(x));