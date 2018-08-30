SUMMARY = "Template processing system"
HOMEPAGE = "http://www.template-toolkit.org/"

LICENSE = "Artisticv1 | GPLv1+"
LIC_FILES_CHKSUM = " \
    file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
    file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d \
" 

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABW/Template-Toolkit-${PV}.tar.gz"

SRC_URI[md5sum] = "a7fae5d4fe5918f33105d92a62134067"
SRC_URI[sha256sum] = "1311a403264d0134c585af0309ff2a9d5074b8ece23ece5660d31ec96bf2c6dc"

S = "${WORKDIR}/Template-Toolkit-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
