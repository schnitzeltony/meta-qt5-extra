SUMMARY = "Addons to QtCore"
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & GPL-2.0 & GPL-2.0+ & LGPL-2.0 & LGPL-2.0+ & LGPL-2.1 & LGPL-2.1+ & LGPL-3.0 & MPL-1.1 & Qt-LGPL-exception-1.1"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=6fd064768b8d61c31ddd0540570fbd33 \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MPL-1.1.txt;md5=bf952b9d390406a3cda9fb3fe9df72af \
    file://LICENSES/Qt-LGPL-exception-1.1.txt;md5=38d22f987f077611a625f5729dd0fd39 \
"

inherit kde-kf5 mime

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "7af6221846d7552bb99c04c2fac2d9f9c247e6cdd13cb3e37e9694fa0b8f2c51"
