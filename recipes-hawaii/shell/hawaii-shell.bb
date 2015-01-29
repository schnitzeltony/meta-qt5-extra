require ${BPN}.inc

#inherit systemd

DEPENDS += " \
    ${BPN}-native \
    greenisland \
    qtscript \
    qtdeclarative \
    qtquickcontrols \
    libqtxdg \
    plasma-framework \
    plasma-workspace \
    ki18n \
    kdelibs4support \
    kitemmodels \
    krunner \
    kservice \
    solid \
"

SRC_URI += " \
    file://0002-make-build-process-find-native-enhancedqdbusxml2cpp.patch \
    file://0003-add-fPIC-to-libHawaiiQtXDG-compiler-options.patch \
    file://0004-Add-an-option-ENABLE_MAINLINE_QTXDG-to-use-mainline-.patch \
"

EXTRA_OECMAKE += "-DENABLE_MAINLINE_QTXDG=ON"

# starter scripts rely on bash qdbus catchsegv
RDEPENDS_${PN} = "bash qttools-tools qtwayland-plugins catchsegv"

RRECOMMENDS_${PN} += "hawaii-wallpapers"

FILES_${PN} += " \
	${datadir} \
	${libdir}/qml \
	${libdir}/plugins \
	${libdir}/systemd \
"

FILES_${PN}-dbg += " \
        ${libdir}/plugins/*/.debug \
	${libdir}/qml/*/*/.debug \
	${libdir}/qml/*/*/*/.debug \
"
