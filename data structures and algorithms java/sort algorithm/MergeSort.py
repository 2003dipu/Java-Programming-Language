
"""
  Sorts a list of data using the merge sort algorithm.

  Args:
    data: A list of comparable elements.

  Returns:
    A new list containing the sorted elements from the input data.
  """
  
def merge_sort(data):

  # Base case: a list of one or zero elements is already sorted
  if len(data) <= 1:
    return data

  # Divide the list in half
  middle = len(data) // 2
  left_half = data[:middle]
  right_half = data[middle:]

  # Recursively sort the halves
  left_half = merge_sort(left_half)
  right_half = merge_sort(right_half)

  # Conquer: merge the sorted halves
  return merge(left_half, right_half)


"""
  Merges two sorted lists into a single sorted list.

  Args:
    left: A sorted list of elements.
    right: A sorted list of elements.

  Returns:
    A new list containing the sorted elements from both input lists.
    """
def merge(left, right):
  
  merged = []
  while left and right:
    if left[0] <= right[0]:
      merged.append(left.pop(0))
    else:
      merged.append(right.pop(0))
  merged.extend(left)
  merged.extend(right)
  return merged

# Example usage
data = [ 7, 5, 6, 8,10, 9, 11, 1, 2, 4, 3 ]
sorted_data = merge_sort(data)

print()
print(f"Sorted data: {sorted_data}")
print()
