do_configure:append() {
     # strCmdLine.replace(QString("STRING_FULL_PATH"), QString("STRING_PATH"));
     sed -i 's:STRING_FULL_PATH:${TMPDIR}:g' ${S}/src/tools/qdbusxml2cpp/qdbusxml2cpp.cpp
     sed -i 's:STRING_PATH:<oe-temp>:g' ${S}/src/tools/qdbusxml2cpp/qdbusxml2cpp.cpp
}
