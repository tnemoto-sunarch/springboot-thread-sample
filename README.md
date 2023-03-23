## SpringBootで@Asyncを使用したスレッドのサンプル

### 見るべきところ
- jp.co.sunarch.sample.service.ThreadService
    - @Async で非同期化
    - スレッドプールの設定を変えたい場合、名称設定
- jp.co.sunarch.sample.configuration.ThreadConfiguration
    - taskExecutorという名称で@Bean作るとデフォルト設定
    - スレッドプールの設定を変えたい場合、@Asyncの名前に合わせて@Beanで指定

## 免責事項
ただのサンプルなので自己責任で。
何が起きても当方は責任を持ちません。