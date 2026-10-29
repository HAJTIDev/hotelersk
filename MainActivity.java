import sys


def main():
  # Odczytaj całe standardowe wejście i podziel na tokeny/linie
  input_data = sys.stdin.read().split()
  for line in input_data:
    if not line:
      continue
    char = line[0]
    if char == "Z":
      break
    print(chr(ord(char) + 1))


if __name__ == "__main__":
  main()
