
const myAtoi = (s) => {

	let result = []
	
	// first remove whitespace
	s = s.trim()

	// check for presence of sign
	let sign = 1;
	const potentialSign = s[0];
	switch(potentialSign){
		case '-':
			sign = -1;
			s = s.slice(1)
			break;

		case '+':
			s = s.slice(1)
			break;

		default:
			break;
	}

	// check first non space char
	if(isNaN(parseInt(s[0]))){
		return 0
	}

	for (let i = 0; i < s.length ; i++) {
		if(isNaN(parseInt(s[i]))) break;

		result.push(s[i]);
	}

	result = parseInt(result.join(""))

	// final check for -2^32<num<2^32 -1

	if(result>Math.pow(2,31)){
        if(sign>=1){
            result = Math.pow(2,31) - 1;
        } else {
            result = Math.pow(2,31);
        }
		
	}



	return sign*result;
}

function main(){
	const inputStrings = ["25", "   -25", "999 with words", "words and 567", "-91283472332", "91283472332"];

    for (let i = 0; i < inputStrings.length; i++) {
        console.log(i + 1 + ".\tInput string     : \"" + inputStrings[i] + "\"");

        const stoi = myAtoi(inputStrings[i]);

        console.log("\tConverted integer: " + stoi);
        console.log("-".repeat(100));
    }
}

main();