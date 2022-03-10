SUMMARY = "Syntax highlighting Engine for Structured Text and Code"
LICENSE = "GPL-2.0-only & LGPL-2.0-only & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5 perlnative

SRC_URI[sha256sum] = "370a45b274db90e8d2d34d61d3f665a3f1f9f552d4503ce5805a47f445c4f93a"

PV = "${KF5_VERSION}"
