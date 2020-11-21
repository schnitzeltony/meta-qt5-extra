SUMMARY = "Open Collaboration Services API"
LICENSE = "LGPLv2.0+ & LGPLv2.1 & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5

SRC_URI[sha256sum] = "64b262f61935653b91a83f4d1c659e7dcaf575b12aa955fe16d8392adb256e22"

PV = "${KF5_VERSION}"
