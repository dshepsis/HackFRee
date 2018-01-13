const COUNT_TO = 1000;

/* A method arising from a literal interpretation of the question: */
let sum1 = 0;
for (let i = 1; i < COUNT_TO; ++i) {
  if ((i % 3 === 0) || (i % 5 === 0)) {
    sum1 += i;
  }
}
console.log(sum1);

/* Another method arising from insight into the particular question */
let sum2 = 0;
for (let i = 3; i < COUNT_TO; i += 3) {
  sum2 += i;
}
for (let i = 5; i < COUNT_TO; i += 5) {
  sum2 += i;
}
for (let i = 15; i < COUNT_TO; i += 15) {
  sum2 -= i;
}
console.log(sum2);

/* Yet another method, further abstracting the problem using functions: */
function triangleNumber(upperBound) {
  return (upperBound + 1) / 2 * upperBound;
}
function sumOfMultiples(upperBound, base) {
  return base * triangleNumber(Math.trunc(upperBound/base));
}
const sum3 = (
  sumOfMultiples(COUNT_TO-1, 3) +
  sumOfMultiples(COUNT_TO-1, 5) -
  sumOfMultiples(COUNT_TO-1, 15)
);
console.log(sum3);
