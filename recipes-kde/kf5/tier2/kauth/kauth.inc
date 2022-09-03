SUMMARY = "Abstraction to system policy and authentication features"
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & LGPL-2.1-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "d74dc553b3628657241d6e7129b17a38e5fd3b26b21de000390382c871ca42f5"

EXTRA_OECMAKE += "-DAUTOTESTS=OFF"
