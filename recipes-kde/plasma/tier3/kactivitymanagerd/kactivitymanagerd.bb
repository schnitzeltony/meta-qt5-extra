SUMMARY = "System service to manage user's activities"
LICENSE = "GPLv2 | GPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING.GPL2;md5=b234ee4d69f5fce4486a80fdaf4a4263 \
    file://COPYING.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit kde-plasma

DEPENDS += " \
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
SRC_URI[md5sum] = "56be367990b9446ea1eac05c05d4ef6d"
SRC_URI[sha256sum] = "e62f3b1f3e40eb0863c875dce01170e21502c78c096c2df9f838c62332f9437f"
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
