function outlookNegative(arr)
{
	for (var i = 0; i < arr.length; i++)
	{
		if (arr[i]>0)
		{
			arr[i]=-Math.abs(arr[i]);
		}
	}
	return arr;
}
