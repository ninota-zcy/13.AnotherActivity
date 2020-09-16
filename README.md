# 13.AnotherActivity
两个activity之间互相传参

在主activity中，实现onActivityResult(int requestCode, int resultCode, @Nullable Intent data)方法，传递intent并startActivityForResult(intent,0);

在子activity中 setResult(0,intent);
