SUMMARY = "Qt wrapper for BlueZ 5 DBus AP"
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

DEPENDS += "qtdeclarative"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "033a9fd5f3a8bcf54649bae79dbad036f8c4cf74683809c1c908807270e6ea99"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"
