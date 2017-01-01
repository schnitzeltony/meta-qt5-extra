SUMMARY = "System service to manage user's activities"
LICENSE = "GPLv2 | GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += " \
    boost \
    kdbusaddons \
    ki18n \
    kcoreaddons \
    kconfig \
    kxmlgui \
    kwindowsystem \
    kio \
    kservice \
    kglobalaccel \
"

PV = "${PLASMA_VERSION}"
SRC_URI[md5sum] = "0d0125c7b05888e51007ecc09d5f39e1"
SRC_URI[sha256sum] = "90bf07e74aa2923550a5188c75c7d2031ea80a442d7a9cf7f1bc58fbfdb2981d"
SRC_URI += "file://0001-replace-try_run-by-try_compile-in-compiler-feature-c.patch"

FILES_SOLIBSDEV = ""

FILES_${PN} += " \
	${datadir}/k*5 \
    ${libdir}/libkactivitymanagerd_plugin.so \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-dbg += " \
    ${OE_QMAKE_PATH_PLUGINS}/*/*/.debug \
"
