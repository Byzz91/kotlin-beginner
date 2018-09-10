// java
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        view.setAlpha(0.5f);
    }
});

// kotlin
button.setOnClickListener {
    view -> view.alpha = 0.5f
}

// 파라메터가 1개일 때 "it"으로 대체 가능하다.
button.setOnClickListener {
    it.alpha = 0.5f
}