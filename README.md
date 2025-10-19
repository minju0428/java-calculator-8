# java-calculator-precourse

# 문자열 덧셈 계산기

##소개

문자열로 입력된 숫자를 덧셈하는 간단한 계산기 코드  
입력 문자열은 기본 구분자(`,`, `:`) 또는 커스텀 구분자를 사용할 수 있으며, 양의 정수만 허용됩니다.

## 기능

### `main(String[] args)`
- 프로그램 실행 시작점
- 사용자 입력을 받고 계산 결과 출력

### `split(String cal)`
- 입력 문자열을 숫자 배열로 분리
- 기본 구분자: `,`, `:`
- 커스텀 구분자 형식 지원: `//구분자\n숫자들`
- 예외: 형식 오류 시 `IllegalArgumentException`

### `sum(String[] parts)`
- 문자열 배열을 정수로 변환하고 양수만 합산
- 예외: 음수, 0, 숫자가 아닌 값 입력 시 `IllegalArgumentException`

## 사용 방법

```bash
덧셈할 문자열을 입력해 주세요.
1,2:3
결과 : 6
