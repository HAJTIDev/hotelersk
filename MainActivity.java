import sys


def process_lines(lines):
  """Przetwarza listę linii wejściowych zgodnie z treścią zadania."""
  output = []
  for line in lines:
    line = line.strip()
    if not line:
      continue
    char = line[0]
    if char == "Z":
      break
    output.append(chr(ord(char) + 1))
  return output


# --- TESTY PYTEST ---


def test_example_case():
  """Test oparty na oficjalnym przykładzie (X, Y, Z)."""
  wejscie = ["X", "Y", "Z"]
  oczekiwane = ["Y", "Z"]
  assert process_lines(wejscie) == oczekiwane


def test_early_z():
  """Test sprawdzający natychmiastowe przerwanie po napotkaniu Z."""
  wejscie = ["Z", "A", "B"]
  oczekiwane = []
  assert process_lines(wejscie) == oczekiwane


def test_alphabet_sequence():
  """Test zwykłej sekwencji liter."""
  wejscie = ["A", "B", "C", "Z"]
  oczekiwane = ["B", "C", "D"]
  assert process_lines(wejscie) == oczekiwane


# --- WŁAŚCIWY PROGRAM DO WYSŁANIA NA OKI ---
# Pamiętaj, żeby to poniżej odkomentować lub wrzucić osobno bez testów,
# gdy będziesz oddawać zadanie na platformie!

# if __name__ == '__main__':
#     for line in sys.stdin:
#         line = line.strip()
#         if not line:
#             continue
#         char = line[0]
#         if char == 'Z':
#             break
#         print(chr(ord(char) + 1))
