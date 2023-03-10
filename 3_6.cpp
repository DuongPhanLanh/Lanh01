include <iostream>
#include<math.h>
#define MAX 100
using namespace std;

/*
hoán vị là một dãy theo thứ tự chứa mỗi phần tử của một tập hợp một và các phần 
tử đó chỉ xuất hiện một lần duy nhất. Việc sắp xếp các phần tử của dãy theo một 
trật tự xác định là điểm khác nhau cơ bản giữa hoán vị và tập hợp.

*/
void nhap (int a[], int &n)
{
    do
    {
        cout << "Nhap so phan tu: "  ;
        cin >> n;
        if(n <= 0 || n > MAX)
        {
            cout <<"Nhap sai";
        }
    }while(n <= 0 || n > MAX);
    for(int i = 0; i < n; i++)
    {
     
      cout << " Phan tu a[" << i << "] " ;
        cin>> a[i];
    }
}

void xuat(int a[], int n)
{
    for(int i = 0; i < n; i++)
    {
        cout <<  a[i]  ;
    }
}

void HoanVi(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}
void SapXepTangDan(int a[], int n)
{
    for(int i = 0; i < n - 1; i++)
    {
        for(int j = i + 1; j < n; j++)
        {
            if(a[i] > a[j])
            {
                HoanVi(a[i],a[j]);
            }
        }
    }
}

void KiemTraBCoPhaiLaHoanViCuaA(int a[],int b[], int na, int nb)
{
    if(na != nb)
    {
        printf("\nKhong phai");      // Số lượng phần tử phải bằng nhau
        return;
    }
    SapXepTangDan(a, na);           // Sắp xếp mảng a
    SapXepTangDan(b, nb);           // Sắp xếp mảng b
    for(int i = 0; i < na; i++)
    {
        if(a[i] != b[i])              
        {
            cout<<"Khong dung";
            return;
        }
    }
    cout << "dung";
    return;
}
int main()
{
    int na, nb;
    int a[MAX], b[MAX];

    nhap(a, na);
    xuat(a, na);

    nhap(b, nb);
    xuat(b, nb);

    KiemTraBCoPhaiLaHoanViCuaA(a, b, na, nb);

    
    return 0;
}
