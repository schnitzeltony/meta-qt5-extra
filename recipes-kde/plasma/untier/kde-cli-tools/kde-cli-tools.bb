SUMMARY = "Tools based on KDE Frameworks 5 to better interact with the system"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.LIB;md5=4fbd65380cdd255951079008b364516c \
"

inherit kde-plasma

DEPENDS += " \
    qtsvg \
    ${@bb.utils.contains("DISTRO_FEATURES", "x11", "qtx11extras", "",d)} \
    \
    kconfig \
    kiconthemes \
    ki18n \
    kcmutils \
    kdesu \
    kdelibs4support \
    kwindowsystem \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "45d17f187fea978d2892472c6a52bd5e"
SRC_URI[sha256sum] = "f5038119e5e67b1b1086e46c9e03a754a3393193d5149f67f2a433e24aeca767"

# do not move so-libs to -dev package
FILES_SOLIBSDEV = ""

FILES_${PN} += " \
    ${datadir}/kservices5 \
    ${libdir}/plugins \
    ${libdir}/libkdeinit5_kcmshell5.so \
"

FILES_${PN}-dbg += " \
    ${libdir}/*/.debug \
    ${libdir}/${BPN}/*/.debug \
"
