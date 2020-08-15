import numpy as np

def is_kaibun(str):
	a = np.zeros(1000)
	for c in str:
		if a[ord(c)] > 0:
			a[ord(c)] -= 1
		else:
			a[ord(c)] += 1
	if a.sum() > 1:
		return False
	else:
		return True

	