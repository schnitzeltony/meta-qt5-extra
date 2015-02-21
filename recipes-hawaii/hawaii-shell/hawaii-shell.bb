require ${BPN}.inc

#inherit systemd

DEPENDS += " \
    ${BPN}-native \
    qtbase \
    qtdeclarative \
    \
    libqtxdg \
    \
    kdelibs4support \
    kconfig \
    kcoreaddons \
    kio \
    krunner \
    kservice \
    solid \
    \
    greenisland \
"

# REVISIT optionals
DEPENDS += " \
    alsa-lib \
    pulseaudio \
"

# starter scripts rely on bash qdbus catchsegv
RDEPENDS_${PN} = "bash qttools-tools qtwayland-plugins catchsegv"

# REVISIT optionals
RRECOMMENDS_${PN} += " \
    hawaii-wallpapers \
    hawaii-icon-themes \
    weston \
"

   
SRC_URI += " \
    file://0002-make-build-process-find-native-enhancedqdbusxml2cpp.patch \
"

EXTRA_OECMAKE += "-DENABLE_MAINLINE_QTXDG=ON"

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
