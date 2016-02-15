SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/abstractrunner.h;endline=18;md5=a6a49d7635ef149bcddf8c46f0eae999"

inherit kde-kf5-porting-aids cmake-lib

DEPENDS += "qtdeclarative kconfig kcoreaddons ki18n kio kservice plasma-framework solid threadweaver"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "c43cef2cc5b9322dd34c849ba3474c89"
SRC_URI[sha256sum] = "bd164d588c3e29713f8283f3bf7ee6175cddd97a3e9eb7ee3b22769ac0409a14"

CMAKE_ALIGN_SYSROOT[1] = "KF5Runner, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Runner, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/*/.debug"
