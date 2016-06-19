SUMMARY = "Framework for providing different actions given a string query"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/abstractrunner.h;endline=18;md5=a6a49d7635ef149bcddf8c46f0eae999"

inherit kde-kf5 cmake-lib

DEPENDS += "qtdeclarative kconfig kcoreaddons ki18n kio kservice plasma-framework solid threadweaver"

PV = "${KF5_VERSION}"
SRC_URI[md5sum] = "5b3cadf4d586d15729b97b8c152e82b7"
SRC_URI[sha256sum] = "52ac6b5a7c99fa0cb9e776b06348511fe5373fc9acc2842be760c7ae60a2d9dd"

CMAKE_ALIGN_SYSROOT[1] = "KF5Runner, -S${libdir}/lib, -S${STAGING_LIBDIR}/lib"
CMAKE_ALIGN_SYSROOT[2] = "KF5Runner, -S${includedir}, -S${STAGING_INCDIR}"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kdevappwizard \
    ${OE_QMAKE_PATH_QML}/org/kde \
"
FILES_${PN}-dbg += "${OE_QMAKE_PATH_QML}/org/kde/*/.debug"
