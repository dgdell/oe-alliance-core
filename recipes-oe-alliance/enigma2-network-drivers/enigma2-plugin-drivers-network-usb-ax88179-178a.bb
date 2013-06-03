DESCRIPTION = "ASIX AX88179_178A USB 3.0/2.0 Gigabit Ethernet Network Adapter"
PACKAGE_ARCH = "all"

require conf/license/license-gplv2.inc

RDEPENDS_${PN} = " \
	ax88179-178a \
	"

PV = "1.0"
PR = "r0"

ALLOW_EMPTY_${PN} = "1"
