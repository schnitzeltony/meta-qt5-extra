SUMMARY = "A QtQuick module providing high-performance charts"
LICENSE = "LGPL-2.1-only & LGPL-3.0-only & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS += "qtquickcontrols2"

SRC_URI[sha256sum] = "1a430e2909b137466cf41c334a60ebc01e4cde82e71acbb167cd64d1f13e8678"

PV = "${KF5_VERSION}"

FILES:${PN} += "${OE_QMAKE_PATH_QML}"
